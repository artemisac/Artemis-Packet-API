package cc.ghast.packet.wrapper.packet.play.server;

import cc.ghast.packet.nms.ProtocolVersion;
import cc.ghast.packet.buffer.ProtocolByteBuf;
import ac.artemis.packet.spigot.wrappers.GPacket;
import cc.ghast.packet.wrapper.packet.ReadableBuffer;
import cc.ghast.packet.wrapper.packet.WriteableBuffer;
import lombok.Getter;

import java.util.UUID;
import java.util.function.Consumer;


public class PacketPlayServerEntityMetadata extends GPacket implements ReadableBuffer, WriteableBuffer {
    public PacketPlayServerEntityMetadata(UUID player, ProtocolVersion version) {
        super("PacketPlayOutEntityMetadata", player, version);
    }

    public PacketPlayServerEntityMetadata(int entityId, Consumer<ProtocolByteBuf> buffer) {
        super("PacketPlayOutEntityMetadata");
        this.entityId = entityId;
        this.modifier = buffer;
    }
    @Getter
    private int entityId;
    @Getter
    private ProtocolByteBuf buffer;

    private Consumer<ProtocolByteBuf> modifier;

    @Override
    public void read(ProtocolByteBuf byteBuf) {
        if (version.isOrBelow(ProtocolVersion.V1_7_10)) {
            this.entityId = byteBuf.readInt();
        } else {
            this.entityId = byteBuf.readVarInt();
        }
        this.buffer = byteBuf.copy();
    }

    @Override
    public void write(ProtocolByteBuf byteBuf) {
        byteBuf.writeVarInt(entityId);
        modifier.accept(byteBuf);
    }
}

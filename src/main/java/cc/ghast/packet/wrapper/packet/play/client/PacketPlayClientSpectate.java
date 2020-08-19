package cc.ghast.packet.wrapper.packet.play.client;

import cc.ghast.packet.nms.ProtocolVersion;
import cc.ghast.packet.buffer.ProtocolByteBuf;
import cc.ghast.packet.wrapper.packet.ClientPacket;
import cc.ghast.packet.wrapper.packet.Packet;
import lombok.Getter;

import java.util.UUID;

@Getter
public class PacketPlayClientSpectate extends Packet<ClientPacket> {
    public PacketPlayClientSpectate(UUID player, ProtocolVersion version) {
        super("PacketPlayInSpectate", player, version);
    }

    private UUID entityId;

    @Override
    public void handle(ProtocolByteBuf byteBuf) {
        this.entityId = byteBuf.readUUID();
    }
}

package cc.ghast.packet.wrapper.packet.play.server;

import cc.ghast.packet.nms.ProtocolVersion;
import cc.ghast.packet.buffer.ProtocolByteBuf;
import ac.artemis.packet.spigot.wrappers.GPacket;
import cc.ghast.packet.wrapper.packet.ReadableBuffer;

import java.util.UUID;

public class PacketPlayServerKickDisconnect extends GPacket implements ReadableBuffer {
    public PacketPlayServerKickDisconnect(UUID player, ProtocolVersion version) {
        super("PacketPlayOutKickDisconnect", player, version);
    }

    @Override
    public void read(ProtocolByteBuf byteBuf) {

    }
}

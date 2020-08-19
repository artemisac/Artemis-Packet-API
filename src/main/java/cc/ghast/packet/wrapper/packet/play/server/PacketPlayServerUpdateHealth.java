package cc.ghast.packet.wrapper.packet.play.server;

import cc.ghast.packet.nms.ProtocolVersion;
import cc.ghast.packet.buffer.ProtocolByteBuf;
import cc.ghast.packet.wrapper.packet.Packet;
import cc.ghast.packet.wrapper.packet.ServerPacket;

import java.util.UUID;

public class PacketPlayServerUpdateHealth extends Packet<ServerPacket> {
    public PacketPlayServerUpdateHealth(UUID player, ProtocolVersion version) {
        super("PacketPlayOutUpdateHealth", player, version);
    }

    @Override
    public void handle(ProtocolByteBuf byteBuf) {

    }
}

package cc.ghast.packet.wrapper.packet.play.server;

import ac.artemis.packet.protocol.ProtocolVersion;
import ac.artemis.packet.spigot.protocol.PacketLink;
import ac.artemis.packet.wrapper.server.PacketPlayServerVehicleMove;
import cc.ghast.packet.buffer.ProtocolByteBuf;
import ac.artemis.packet.spigot.wrappers.GPacket;
import cc.ghast.packet.wrapper.packet.ReadableBuffer;

import java.util.UUID;

@PacketLink(PacketPlayServerVehicleMove.class)
public class GPacketPlayServerVehicleMove extends GPacket implements PacketPlayServerVehicleMove, ReadableBuffer {
    public GPacketPlayServerVehicleMove(UUID player, ProtocolVersion version) {
        super("PacketPlayOutVehicleMove", player, version);
    }

    @Override
    public void read(ProtocolByteBuf byteBuf) {

    }
}

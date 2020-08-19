package cc.ghast.packet.wrapper.packet.play.client;

import cc.ghast.packet.nms.ProtocolVersion;
import cc.ghast.packet.buffer.ProtocolByteBuf;
import cc.ghast.packet.wrapper.packet.ClientPacket;
import cc.ghast.packet.wrapper.packet.Packet;
import lombok.Getter;

import java.util.UUID;


@Getter
public class PacketPlayClientChat extends Packet<ClientPacket> {

    public PacketPlayClientChat(UUID player, ProtocolVersion version) {
        super("PacketPlayInChat", player, version);
    }

    private String message;

    @Override
    public void handle(ProtocolByteBuf byteBuf) {
        this.message = byteBuf.readString();
    }
}

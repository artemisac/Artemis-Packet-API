package cc.ghast.packet.wrapper.buffer.types.minecraft;

import cc.ghast.packet.wrapper.buffer.BufConverter;
import cc.ghast.packet.wrapper.buffer.types.Converters;
import cc.ghast.packet.wrapper.nbt.WrappedItem;
import com.github.steveice10.opennbt.tag.builtin.CompoundTag;
import io.netty.buffer.ByteBuf;

import java.io.IOException;

/**
 * @author Ghast
 * @since 09-May-20
 */
public class ItemConverter extends BufConverter<WrappedItem> {

    public ItemConverter() {
        super("WrappedItem", WrappedItem.class);
    }

    @Override
    public void write(ByteBuf buffer, WrappedItem value) throws IOException {
        if (value == null || value.getId() == -1) {
            buffer.writeShort(-1);
        } else {
            buffer.writeShort(value.getId());
            buffer.writeByte(value.getAmount());
            Converters.NBT.write(buffer, value.getTag());
        }
    }

    @Override
    public WrappedItem read(ByteBuf buffer) throws IOException {
        short id = buffer.readShort();
        byte amount = buffer.readByte();
        CompoundTag tag = Converters.NBT.read(buffer);
        return new WrappedItem(id, amount, tag);
    }

}

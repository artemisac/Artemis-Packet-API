package cc.ghast.packet.wrapper.buffer.types.java;

import cc.ghast.packet.wrapper.buffer.BufConverter;
import io.netty.buffer.ByteBuf;

/**
 * @author Ghast
 * @since 01-May-20
 */
public class FloatConverter extends BufConverter<Float> {

    public FloatConverter() {
        super("Float", Float.class);
    }

    @Override
    public void write(ByteBuf buffer, Float value) {
        buffer.writeFloat(value);
    }

    @Override
    public Float read(ByteBuf buffer) {
        return buffer.readFloat();
    }
}

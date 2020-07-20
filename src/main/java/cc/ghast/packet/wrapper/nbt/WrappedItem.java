package cc.ghast.packet.wrapper.nbt;

import com.github.steveice10.opennbt.tag.builtin.CompoundTag;
import lombok.*;

/**
 * @author Ghast
 * @since 09-May-20
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class WrappedItem {
    private short id;
    private byte amount;
    private short data;
    private CompoundTag tag;

    public WrappedItem(short id, byte amount, short data, CompoundTag tag) {
        this.id = id;
        this.amount = amount;
        this.data = data;
        this.tag = tag;
    }

    public WrappedItem(short id, byte amount, CompoundTag tag) {
        this.id = id;
        this.amount = amount;
        this.tag = tag;
    }
}

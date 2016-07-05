package AbstractFactory;

import Common.Room;

/**
 *
 * @author Ujjal Suttra Dhar <self@ujjal.net>
 * @date Jul 6, 2016
 */
public class EnchantedRoom extends Room {
    private boolean isSpell = false;
    public EnchantedRoom(int n, boolean is) {
        super(n);
        isSpell = is;
    }
}

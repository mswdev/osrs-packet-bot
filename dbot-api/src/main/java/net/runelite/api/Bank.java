package net.runelite.api;

import net.runelite.api.widgets.WidgetItem;

public interface Bank extends Openable {

    void depositAll(WidgetItem item);

    void withdrawAll(WidgetItem item);

    void withdraw(WidgetItem item, int amount);

    void deposit(WidgetItem item, int amount);

    void depositAll();

    void depositEquipment();

    int[] BANK_IDS = {
            ObjectID.BANK_CHEST,
            ObjectID.BANK_CHEST_4483,
            ObjectID.BANK_BOOTH,
            ObjectID.BANK_BOOTH_10083,
            ObjectID.BANK_BOOTH_10355,
            ObjectID.BANK_BOOTH_10357,
            ObjectID.BANK_BOOTH_10517,
            ObjectID.BANK_BOOTH_10527,
            ObjectID.BANK_CHEST_10562,
            ObjectID.BANK_BOOTH_10583,
            ObjectID.BANK_BOOTH_10584,
            ObjectID.BANK_BOOTH_11338,
            ObjectID.BANK_BOOTH_12798,
            ObjectID.BANK_BOOTH_12799,
            ObjectID.BANK_BOOTH_12800,
            ObjectID.BANK_BOOTH_12801,
            ObjectID.BANK_BOOTH_14367,
            ObjectID.BANK_BOOTH_14368,
            ObjectID.BANK_CHEST_14382,
            ObjectID.BANK_CHEST_14886,
            ObjectID.BANK_BOOTH_16642,
            ObjectID.BANK_CHEST_16695,
            ObjectID.BANK_CHEST_16696,
            ObjectID.BANK_BOOTH_16700,
            ObjectID.BANK_BOOTH_18491,
            ObjectID.BANK_CHEST_19051,
            ObjectID.BANK_BOOTH_20325,
            ObjectID.BANK_BOOTH_20326,
            ObjectID.BANK_BOOTH_20327,
            ObjectID.BANK_BOOTH_20328,
            ObjectID.BANK_CHEST_21301,
            ObjectID.BANK_BOOTH_22819,
            ObjectID.BANK_BOOTH_24101,
            ObjectID.BANK_BOOTH_24347,
            ObjectID.BANK_BOOTH_25808,
            ObjectID.BANK_CHEST_26707,
            ObjectID.BANK_CHEST_26711,
            ObjectID.BANK_BOOTH_27254,
            ObjectID.BANK_BOOTH_27260,
            ObjectID.BANK_BOOTH_27263,
            ObjectID.BANK_BOOTH_27265,
            ObjectID.BANK_BOOTH_27267,
            ObjectID.BANK_BOOTH_27292,
            ObjectID.BANK_BOOTH_27718,
            ObjectID.BANK_BOOTH_27719,
            ObjectID.BANK_BOOTH_27720,
            ObjectID.BANK_BOOTH_27721,
            ObjectID.BANK_BOOTH_28429,
            ObjectID.BANK_BOOTH_28430,
            ObjectID.BANK_BOOTH_28431,
            ObjectID.BANK_BOOTH_28432,
            ObjectID.BANK_BOOTH_28433,
            ObjectID.BANK_BOOTH_28546,
            ObjectID.BANK_BOOTH_28547,
            ObjectID.BANK_BOOTH_28548,
            ObjectID.BANK_BOOTH_28549,
            ObjectID.BANK_CHEST_28594,
            ObjectID.BANK_CHEST_28595,
            ObjectID.BANK_CHEST_28816,
            ObjectID.BANK_CHEST_28861,
            ObjectID.BANK_CHEST_29321,
            ObjectID.BANK_CHEST_30087,
            ObjectID.BANK_CHEST_30267,
            ObjectID.BANK_CHEST_30926,
            ObjectID.BANK_CHEST_30989,
            ObjectID.BANK_BOOTH_32666,
            ObjectID.BANK_CHEST_34343,
            ObjectID.BANK_BOOTH_36559
    };

}

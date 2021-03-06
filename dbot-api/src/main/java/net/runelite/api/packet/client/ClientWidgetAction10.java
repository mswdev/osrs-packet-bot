package net.runelite.api.packet.client;

import lombok.Data;
import lombok.EqualsAndHashCode;
import net.runelite.api.packet.PacketInfo;

@Data
@PacketInfo("CLIENT_WIDGET_ACTION_10")
@EqualsAndHashCode(callSuper = true)
public class ClientWidgetAction10 extends ClientPacket {

    private final int widgetId;
    private final int param;
    private final int itemId;

}

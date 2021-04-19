package me.rigamortis.seppuku.impl.gui.hud.component;

import com.mojang.realmsclient.gui.ChatFormatting;
import me.rigamortis.seppuku.api.gui.hud.component.DraggableHudComponent;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * created by noil on 9/1/2019 at 4:27 PM
 */
public final class TimeComponent extends DraggableHudComponent {

    public TimeComponent() {
        super("Time");
        this.setH(mc.fontRenderer.FONT_HEIGHT);
    }

    @Override
    public void render(int mouseX, int mouseY, float partialTicks) {
        super.render(mouseX, mouseY, partialTicks);

        final String hourMinute = new SimpleDateFormat("h:mm").format(new Date());
        final String amPm = new SimpleDateFormat("a").format(new Date());
        final String time = ChatFormatting.RESET + hourMinute + " " + ChatFormatting.GRAY + amPm;

        this.setW(mc.fontRenderer.getStringWidth(time));
        mc.fontRenderer.drawStringWithShadow(time, this.getX(), this.getY(), -1);
    }
}

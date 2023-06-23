package UAW;

import UAW.audiovisual.Sfx;
import UAW.content.*;
import UAW.content.blocks.*;
import arc.Events;
import mindustry.game.EventType.FileTreeInitEvent;
import mindustry.mod.Mod;

public class UAWModLoader extends Mod {
	public UAWModLoader() {
		Events.on(FileTreeInitEvent.class, e -> Sfx.load());
	}

	public void loadContent() {
        ACMBlock.load();
	}
}
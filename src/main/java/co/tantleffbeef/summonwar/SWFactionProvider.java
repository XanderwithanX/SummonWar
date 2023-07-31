package co.tantleffbeef.summonwar;
import io.lumine.mythic.api.adapters.AbstractPlayer;
import io.lumine.mythic.core.players.factions.FactionProvider;

import java.util.*;

public class SWFactionProvider implements FactionProvider {
    private Map<UUID, Optional<String>> list = new HashMap<UUID, Optional<String>>();


    @Override
    public boolean isInFaction(AbstractPlayer abstractPlayer, String s) {
        UUID player = abstractPlayer.getUniqueId();
        if(list.get(player).equals(s))
            return true;
        return false;
    }

    @Override
    public Optional<String> getFaction(UUID uuid) {
        if(list.containsKey(uuid)) {
            return list.get(uuid);
        } else {
            return Optional.empty();
        }
    }

    public void setFaction(UUID uuid, String faction) {
        if(list.containsKey(uuid)) {
            list.replace(uuid, Optional.of(faction));
        } else {
            list.put(uuid, Optional.of(faction));
        }
    }
}

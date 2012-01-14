package org.guardian.entries;

import java.util.List;
import org.bukkit.block.BlockState;

public class DeathEntry extends DataEntry {

    private String cause, killer;

    public String getCause() {
        return cause;
    }

    public String getKiller() {
        return killer;
    }

    @Override
    public String getMessage() {
        final StringBuilder msg = new StringBuilder();
        if (date > 0) {
            msg.append(dateFormat.format(date));
            msg.append(" ");
        }
        msg.append(playerName);
        msg.append(" ");
        msg.append("was killed by ");
        msg.append(killer);
        if (loc != null) {
            msg.append(" at ");
            msg.append(loc.getBlockX());
            msg.append(":");
            msg.append(loc.getBlockY());
            msg.append(":");
            msg.append(loc.getBlockZ());
        }
        msg.append("caused by ");
        msg.append(cause);
        return msg.toString();
    }

    @Override
    public List<BlockState> getRollbackBlockStates() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<BlockState> getRebuildBlockStates() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

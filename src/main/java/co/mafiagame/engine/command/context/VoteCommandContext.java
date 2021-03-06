/*
 * Copyright (C) 2015 mafiagame.ir
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package co.mafiagame.engine.command.context;

import co.mafiagame.common.channel.InterfaceContext;
import co.mafiagame.engine.domain.Game;

import java.util.List;

/**
 * @author nazila
 */
public class VoteCommandContext extends CommandContext {

    private final String voterUsername;
    private final List<String> votedUsername;

    public VoteCommandContext(InterfaceContext interfaceContext, Game game,
                              String voterUsername, List<String> votedUsername) {
        super(interfaceContext, game);
        this.voterUsername = voterUsername;
        this.votedUsername = votedUsername;
    }

    public String getVoterUsername() {
        return voterUsername;
    }

    public List<String> getVotedUsername() {
        return votedUsername;
    }

}

package me.abhi.hcf.util;

import org.bukkit.ChatColor;

public enum Messages {

    FACTION_HELP( "&8&m-------------------------------------\n&d&lFactions Command Help\n&8&m-------------------------------------\n&9&lLeader Commands:\n&e/f ally <faction> - Ally with a faction\n/f unally <faction> - Unally with a faction\n/f promote <player> - Promote a player\n/f demote <player> - Demote a player\n/f unclaim - Unclaim land\n/f newleader - Promote a new leader\n/f disband - Disband faction\n \n&9Captain Commands\n&e/f kick <player> - Kick player from faction\n/f claim - Claim land for faction\n/f uninvite <player> - Cancel faction invite\n/f invite <player> - Invite player to faction\n/f sethome - Set faction home\n/f withdraw - Withdraw money from faction\n \n&9Anyone Commands:\n&e/f create <name> - Create a faction\n/f leave - Leave a faction\n/f join <player> - Join a faction\n/f show <player/faction> - View factions details\n/f chat - Switch chat modes\n/f home - Go to faction home\n/f deposit <amount> - Deposit money into faction balance\n/f map - View faction claims\n&8&m-------------------------------------"),
    PVP_HELP("&8&m-------------------------------------\n&e/pvp enable - Disable your PvP Timer\n/pvp time - View time left on your timer\n&8&m-------------------------------------"),
    ENDERPEARL_DELAY("&cYou must wait %time%s to do that again!"),
    MAY_PEARL_AGAIN("&aYou may pearl again!"),
    FACTION_NAME_REQUIREMENT("&cYour faction name must be within 3 and 10 characters and may not contain any special characters."),
    FACTION_CREATED("&eFaction &9%faction% &ehas been &acreated &eby &7%player%"),
    FACTION_ALREADY_EXISTS("&cThat faction already exists."),
    ALREADY_IN_FACTION("&cYou are already in a faction."),
    NOT_IN_FACTION("&cYou are not in a faction."),
    COMBAT_TAGGED("&eYou have been combat-tagged for &c30 &eseconds."),
    MUST_BE_CAPTAIN("&cYou must be captain role to do this."),
    COULD_NOT_FIND_PLAYER("&cCould not find player."),
    PLAYER_ALREADY_HAS_INVITE("&cThat player already has an invite to the faction."),
    PLAYER_INVITED_TO_FACTION("&e%player% has been invited to the faction."),
    INVITE_FROM_FACTION("&7%player% &ehas invited you to join the faction &a%faction%&e."),
    PLAYER_NOT_IN_FACTION("&cThat player is not in a faction."),
    NO_INVITE_FOUND("&cYou do not have an invite from that faction."),
    PLAYER_JOINED_FACTION("&e%player% has joined the faction."),
    CANT_HURT_PERSON("&eYou cannot hurt &2%player%&e."),
    PLAYER_IN_YOUR_FACTION("&cThat player is already in your faction."),
    LEADER_CANT_LEAVE("&cYou are the faction leader. In order to leave the faction, you must elect a new leader or disband the faction."),
    PLAYER_LEFT_FACTION("&e%player% has left the faction."),
    LEFT_FACTION("&cYou have left the faction."),
    CANNOT_KICK_PLAYER("&cYou cannot kick that player from the faction."),
    PLAYER_NOT_IN_YOUR_FACTION("&cThat player is not in your faction."),
    MUST_BE_LEADER("&cYou must be leader role to do this."),
    FACTION_DISBANDED("&eFaction &9%faction% &ehas been &cdisbanded &eby &7%player%&e."),
    NO_LONGER_IN_COMBAT("&eYou are no longer in combat."),
    PLAYER_DOESNT_HAVE_INVITE("&cThat player doesn't have an invite."),
    INVITE_CANCELLED("&e%player%'s invite has been cancelled."),
    CLAIM_WAND_GRANTED("&eYou have been given the claim wand."),
    CLAIM_WAND_REVOKED("&cThe claim was has been removed from your inventory."),
    FIRST_POINT_SET("&eThe first point has been set to &7X: %x%, Z: %z%"),
    SECOND_POINT_SET("&eThe second point has been set to &7X: %x%, Z: %z%"),
    CLAIM_COST_FUNDS("&eThe cost of the claim is &a$%cost%"),
    CLAIM_COST_NO_FUNDS("&eThe cost of the claim is &a$%cost%"),
    MINIMUM_CLAIM("&cThe minimum claim is $40"),
    CLAIM_CLEARED("&cYou have cleared the claim."),
    INSUFFICIENT_FUNDS("&cYou have insufficient funds."),
    LAND_CLAIMED("&eYou have claimed the selected land!"),
    SWITCHING_CLAIMS("&eEntering %entering%&e, Leaving %leaving%"),
    LAND_UNCLAIMABLE("&cThis land is unclaimable. Claims may not touch, nor overlap eachother."),
    HAVE_CLAIM("&cYour faction already has a claim. You must unclaim your current land by doing /f unclaim."),
    NO_CLAIM("&cYour faction does not have a claim."),
    LAND_UNCLAIMED("&eYour faction land has been unclaimed. Your faction has received &a$%price%&e."),
    FACTION_DOESNT_EXIST("&cThat faction does not exist."),
    ALREADY_ALLIED("&cYou are already allied with that faction."),
    ALLIED("&2%faction% &eis now your ally."),
    ALLY_INVITE("&eFaction &2%faction% &ehas invited you to be allies."),
    LEADER_NOT_ONLINE("&cThe leader of that faction is not online."),
    SENT_ALLY_INVITE("&eYour faction has invited &2%faction% &eto be allies."),
    NOT_ALLIED("&cYour faction is not allied with that faction."),
    NO_LONGER_ALLIED("&eYour faction is no longer with allied &2%faction%&e."),
    NO_PERMISSION("&cNo permission."),
    SYSTEM_FACTION_CREATED("&eYou have created the system faction &7%faction%&e."),
    INVALID_CLAIM("&cYou have an invalid claim selection!"),
    NOT_SYSTEM_FACTION("&cThat faction is not a system faction."),
    FACTION_UPDATED("&eThat faction has been updated."),
    DISBANDED_FACTION("&eYou have disbanded the faction &7%faction%&e."),
    ALREADY_CAPTAIN("&cThat player is already captain."),
    PROMOTED("&eYour faction role has been updated to faction %role%."),
    PROMOTED_PLAYER("&eYou have updated &7%player%'s &erole to faction %role%."),
    ALREADY_MEMBER("&cThat player is already member."),
    SWITCHED_TO_FACTION_CHAT("&3Switched to faction chat."),
    SWITCHED_TO_ALLY_CHAT("&2Switched to ally chat."),
    SWITCHED_TO_GLOBAL_CHAT("&eSwitched to global chat."),
    HOME_MUST_BE_IN_CLAIM("&cYour faction home must be in your claim."),
    FACTION_HOME_SET("&eThe faction home has been set."),
    SYSTEM_FACTION("&cThat faction is a system faction!"),
    INVALID_AMOUNT("&cPlease enter a valid amount."),
    FACTION_BALANCE_UPDATED("&aThe faction balance has been updated."),
    IN_COMBAT("&cYou cannot do this in combat."),
    NO_FACTION_HOME("&cYour faction does not have a home."),
    TELEPORT_TIMER_STARTED("&eYour teleport timer has started."),
    TIMER_CANCELLED("&cYour timer has been cancelled."),
    CANT_EDIT_TERRITORY("&eYou cannot do that in %faction%'s territory."),
    SPAWN_COMMAND("&cHCF does not have a spawn command! You must run there.\nSpawn is located at 0,0."),
    NO_PVP_TIMER("&cYou do not have an active PvPTimer."),
    PVP_ENABLED("&aYour PvPTimer has been disabled."),
    PVP_TIME("&aThere is &c&l%time% &aleft on your PvPTimer."),
    GOLDEN_APPLE_COOLDOWN("&cYou are on Golden Apple cooldown."),
    UPDATED_PLAYER_BALANCE("&eUpdated &7%player%'s &ebalance has been updated to &a$%balance%&e."),
    BALANCE_UPDATED("&eYour balance has been updated to &a$%balance%&e."),
    YOUR_BALANCE("&eYour balance is: &a$%balance%"),
    PLAYERS_BALANCE("&7%player%'s &ebalance is: &a$%balance%"),
    DEPOSITED_AMOUNT("&eYou have deposited &a$%amount% &einto the faction balance."),
    AMOUNT_CANT_BE_ZERO("&cPlease enter an amount greater than 0."),
    WITHDREW_AMOUNT("&eYou withdrew &a$%amount% &efrom the faction balance."),
    ALREADY_HAVE_TIMER("&cYou already have this timer activated."),
    PLAYER_HAS_PVP_TIMER("&cThat player currently has their &a&lPvPTimer &cactive."),
    PVP_TIMER_ACTIVE("&cYou currently have an active &a&lPvPTimer&c."),
    SOTW_STARTED("&a&lThe SOTW time has been set to %time%."),
    SOTW_ENDED("&c&lSOTW has ended. PvP is now enabled!"),
    MOD_MODE_STATUS("&eMod mode: %status%");

    private String message;

    private Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return ChatColor.translateAlternateColorCodes('&', message);
    }
}

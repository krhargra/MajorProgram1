/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreakerstudent;

import java.util.ArrayList;

/**
 *
 * @author kahya
 */
public class GameProfile {
    PlayerProfile selectedProfile;
    PlayerProfile highGameProfile;
    ArrayList<PlayerProfile> profiles;
    
    public GameProfile() {
        
    }
    public PlayerProfile getSelectedProfile() {
        PlayerProfile getselectedProfiles = null;
        return getselectedProfiles;
    }
    public PlayerProfile getHighGameProfile() {
        PlayerProfile getHighGameProfile = null;
        return getHighGameProfile;
    }
    public void setHighGameProfile(PlayerProfile prof) {
        highGameProfile = PlayerProfile prof;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return null;
    }
}

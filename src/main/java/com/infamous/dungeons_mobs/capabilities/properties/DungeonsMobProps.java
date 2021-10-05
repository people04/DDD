package com.infamous.dungeons_mobs.capabilities.properties;

public class DungeonsMobProps implements IDungeonsMobProps {
    private int burnNearbyTimer;
    private int freezeNearbyTimer;
    private int gravityPulseTimer;

    public DungeonsMobProps() {
        this.burnNearbyTimer = 10;
        this.burnNearbyTimer = 40;
        this.gravityPulseTimer = 100;
    }

    @Override
    public int getBurnNearbyTimer() {
        return this.burnNearbyTimer;
    }

    @Override
    public void setBurnNearbyTimer(int burnNearbyTimer) {
        this.burnNearbyTimer = burnNearbyTimer;
    }

    @Override
    public int getFreezeNearbyTimer() {
        return this.freezeNearbyTimer;
    }

    @Override
    public void setFreezeNearbyTimer(int freezeNearbyTimer) {
        this.freezeNearbyTimer = freezeNearbyTimer;
    }

    @Override
    public int getGravityPulseTimer() {
        return gravityPulseTimer;
    }

    @Override
    public void setGravityPulseTimer(int gravityPulseTimer) {
        this.gravityPulseTimer = gravityPulseTimer;
    }
}

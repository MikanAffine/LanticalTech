package com.github.nyasroryo.lanticaltech.common.tileentity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.EnergyStorage;

public class TileEntityEnergyStorage extends TileEntity {

  private NBTTagCompound NBTTag;
  private EnergyStorage energyStorage;

  public TileEntityEnergyStorage() {}

  public TileEntityEnergyStorage(int energyStorageSize, int inputRate, int outputRate, int startEnergy) {
    super();
    energyStorage = new EnergyStorage(energyStorageSize, inputRate, outputRate, startEnergy);
  }

  public TileEntityEnergyStorage(int energyStorageSize, int inputRate, int outputRate) {
    this(energyStorageSize, inputRate, outputRate, 0);
  }

  public TileEntityEnergyStorage(int energyStorageSize, int transferRate) {
    this(energyStorageSize, transferRate, transferRate);
  }

  public TileEntityEnergyStorage(int energyStorageSize) {
    this(energyStorageSize, energyStorageSize);
  }

  @Override
  public boolean hasCapability(Capability<?> cap, EnumFacing facing) {
    return (cap == CapabilityEnergy.ENERGY) && (energyStorage != null);
  }

  @Override
  public <T> T getCapability(Capability<T> cap, EnumFacing facing) {
    if ((cap == CapabilityEnergy.ENERGY) && (energyStorage != null)) {
      return (T) energyStorage;
    }
    return null;
  }

  @Override
  public void readFromNBT(NBTTagCompound tagCompound) {
    super.readFromNBT(tagCompound);
    NBTTag = tagCompound;
    energyStorage.receiveEnergy(tagCompound.getInteger("energy"), false);
  }

  @Override
  public NBTTagCompound writeToNBT(NBTTagCompound tagCompound) {
    tagCompound.setInteger("energy", energyStorage.getEnergyStored());
    return super.writeToNBT(tagCompound);
  }
}

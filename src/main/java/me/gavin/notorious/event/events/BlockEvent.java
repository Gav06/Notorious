package me.gavin.notorious.event.events;

import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.eventhandler.Event;

public abstract class BlockEvent extends Event {

	private final BlockPos pos;

	public BlockEvent(BlockPos pos) {
		this.pos = pos;
	}

	public BlockPos getPos() {
		return pos;
	}

	public static class Click extends BlockEvent {
		private final EnumFacing facing;

		public Click(BlockPos pos, EnumFacing facing) {
			super(pos);
			this.facing = facing;
		}

		public EnumFacing getFacing() {
			return facing;
		}
	}

	public static class Damage extends BlockEvent {
		private final EnumFacing facing;

		public Damage(BlockPos pos, EnumFacing facing) {
			super(pos);
			this.facing = facing;
		}

		public EnumFacing getFacing() {
			return facing;
		}
	}

	public static class Destroy extends BlockEvent {
		public Destroy(BlockPos pos) {
			super(pos);
		}
	}

}

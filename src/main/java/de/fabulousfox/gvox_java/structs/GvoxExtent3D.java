package de.fabulousfox.gvox_java.structs;

/**
 * Describes the size of a 3D volume.
 * @param x The width of the volume.
 * @param y The height of the volume.
 * @param z The depth of the volume.
 */
public record GvoxExtent3D(long x, long y, long z) {
}

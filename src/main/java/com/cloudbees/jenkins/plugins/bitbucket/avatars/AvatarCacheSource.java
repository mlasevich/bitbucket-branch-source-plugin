/**
 * 
 */
package com.cloudbees.jenkins.plugins.bitbucket.avatars;

import java.awt.image.BufferedImage;

/**
 * 
 * Interface for Avatar Cache Item Source
 *
 */
public interface AvatarCacheSource {

	/**
	 * Holds Image and lastModified date
	 */
	public static class AvatarImage {
		public final BufferedImage image;
		public final long lastModified;

		public static final AvatarImage EMPTY = new AvatarImage(null, 0);

		public AvatarImage(final BufferedImage image, final long lastModified) {
			this.image = image;
			this.lastModified = lastModified;
		}
	}

	/**
	 * 
	 * Fetch image from source
	 * 
	 * @return AvatarImage object
	 */
	public AvatarImage fetch();

	/**
	 * Get unique hashKey for this item
	 * 
	 * @return AvatarImage object
	 */
	public String hashKey();

	/**
	 * Make sure we can fetch
	 * 
	 * @return true if can fetch
	 */
	public boolean canFetch();

}

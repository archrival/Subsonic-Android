/*
 This file is part of Subsonic.

 Subsonic is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 Subsonic is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with Subsonic.  If not, see <http://www.gnu.org/licenses/>.

 Copyright 2009 (C) Sindre Mehus
 */
package com.thejoshwa.ultrasonic.androidapp.domain;

import java.io.Serializable;

/**
 * @author Sindre Mehus
 */
public class Artist implements Serializable
{

	/**
	 *
	 */
	private static final long serialVersionUID = -5790532593784846982L;
	private String id;
	private String name;
	private String index;
	private String coverArt;
	private Long albumCount;
	private int closeness;

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getIndex()
	{
		return index;
	}

	public void setIndex(String index)
	{
		this.index = index;
	}

	public String getCoverArt()
	{
		return coverArt;
	}

	public void setCoverArt(String coverArt)
	{
		this.coverArt = coverArt;
	}

	public long getAlbumCount()
	{
		return albumCount;
	}

	public void setAlbumCount(Long albumCount)
	{
		this.albumCount = albumCount;
	}

	public int getCloseness()
	{
		return closeness;
	}

	public void setCloseness(int closeness)
	{
		this.closeness = closeness;
	}

	@Override
	public String toString()
	{
		return name;
	}
}
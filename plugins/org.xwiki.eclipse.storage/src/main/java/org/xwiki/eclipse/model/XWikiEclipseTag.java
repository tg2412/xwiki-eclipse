/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.eclipse.model;

import org.xwiki.eclipse.storage.DataManager;

/**
 * @version $Id$
 */
public class XWikiEclipseTag extends ModelObject
{
    private String name;

    private String wiki;

    private String space;

    private String page;

    /**
     * @param dataManager
     */
    public XWikiEclipseTag(DataManager dataManager)
    {
        super(dataManager);
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.xwiki.eclipse.model.ModelObject#getXWikiEclipseId()
     */
    @Override
    public String getXWikiEclipseId()
    {
        return String.format("xwikieclipse://%s/%s/tag/%s", getDataManager().getName(), getWiki(), getName()); //$NON-NLS-1$
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getWiki()
    {
        return wiki;
    }

    public void setWiki(String wiki)
    {
        this.wiki = wiki;
    }

    public String getSpace()
    {
        return space;
    }

    public void setSpace(String space)
    {
        this.space = space;
    }

    public String getPage()
    {
        return page;
    }

    public void setPage(String page)
    {
        this.page = page;
    }
}

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

import java.util.Calendar;

import org.xwiki.eclipse.storage.DataManager;

/**
 * @version $Id$
 */
public class XWikiEclipseComment extends ModelObject
{
    private int id;

    private String author;

    private Calendar date;

    private String text;

    private String highlight;

    private int replyTo;

    /**
     * @param dataManager
     */
    public XWikiEclipseComment(DataManager dataManager)
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
        return String.format("xwikieclipse://%s/comment/%s/%s", getDataManager().getName(), getId(), getAuthor()); //$NON-NLS-1$
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public Calendar getDate()
    {
        return date;
    }

    public void setDate(Calendar date)
    {
        this.date = date;
    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public String getHighlight()
    {
        return highlight;
    }

    public void setHighlight(String highlight)
    {
        this.highlight = highlight;
    }

    public int getReplyTo()
    {
        return replyTo;
    }

    public void setReplyTo(int replyTo)
    {
        this.replyTo = replyTo;
    }
}

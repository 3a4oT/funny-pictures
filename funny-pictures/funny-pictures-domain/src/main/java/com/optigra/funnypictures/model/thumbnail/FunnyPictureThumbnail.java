package com.optigra.funnypictures.model.thumbnail;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.optigra.funnypictures.model.FunnyPicture;
import com.optigra.funnypictures.model.Model;

/**
 * Entity, that describes relation between FunnyPicture and
 * Thumbnail entities.
 * @author ivanursul
 *
 */
@Entity
@Table(name = "funny_picture_thumbnail")
public class FunnyPictureThumbnail extends Model {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "funny_picture_id")
	private FunnyPicture funnyPicture;
	
	@Column(name = "url")
	private String url;
	
	@Column(name = "type")
	@Enumerated(EnumType.STRING)
	private ThumbnailType thumbnailType;

	public FunnyPicture getFunnyPicture() {
		return funnyPicture;
	}

	public void setFunnyPicture(final FunnyPicture funnyPicture) {
		this.funnyPicture = funnyPicture;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(final String url) {
		this.url = url;
	}

	public ThumbnailType getThumbnailType() {
		return thumbnailType;
	}

	public void setThumbnailType(final ThumbnailType thumbnailType) {
		this.thumbnailType = thumbnailType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((thumbnailType == null) ? 0 : thumbnailType.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		FunnyPictureThumbnail other = (FunnyPictureThumbnail) obj;
		if (thumbnailType != other.thumbnailType) {
			return false;
		}
		if (url == null) {
			if (other.url != null) {
				return false;
			}
		} else if (!url.equals(other.url)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "FunnyPictureThumbnail [funnyPicture=" + funnyPicture + ", url="
				+ url + ", thumbnailType=" + thumbnailType + "]";
	}
	
}

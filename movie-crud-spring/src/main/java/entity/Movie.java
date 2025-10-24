package entity;

	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;

	@Entity
	public class Movie {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		Long id;
		String name;
		String genre;
		String imageLink;
		String rating;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		public String getImageLink() {
			return imageLink;
		}
		public void setImageLink(String imageLink) {
			this.imageLink = imageLink;
		}
		public String getRating() {
			return rating;
		}
		public void setRating(String rating) {
			this.rating = rating;
		}
		
		
		
	}


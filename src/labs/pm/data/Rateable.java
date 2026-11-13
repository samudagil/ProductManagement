package labs.pm.data;
@FunctionalInterface
// Tipo de datos genericos
public interface Rateable <T>// Operador diamante
{
	public static final Rating DEFAULT_RATING = Rating.NOT_RATED;
	
	public abstract T applyRating(Rating rating);
	
	public default Rating getRating() {
		return DEFAULT_RATING;
	}
	
	public static Rating convert(int stars) {
		// method logic will ve assed here
		return (stars >= 0 && stars <= 5) ? Rating.values() [stars] : DEFAULT_RATING;
	}
	
	
	
}

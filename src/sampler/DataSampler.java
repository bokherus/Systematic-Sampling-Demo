package sampler;

public abstract class DataSampler<T> {
	
	public abstract T[] sample(T[] data);
	
	protected int getRandomNumber() {
		return (int) (Math.round(Math.random() * 9) + 1);
	}

}

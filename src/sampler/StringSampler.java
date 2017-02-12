package sampler;
public class StringSampler extends DataSampler<String> {

	@Override
	public String[] sample(String[] data) {
		int dataLen = data.length;
		int index = 0;
		int samplingInterval = dataLen / 5;
		int firstData = getRandomNumber();
		System.out.println("First dataSet index = " + firstData);
		System.out.println("Sampling Interval = " + samplingInterval);
		String[] sampled = new String[5];
		for (int i = firstData ; i < dataLen ; i += samplingInterval) {
			sampled[index] = data[i];
			index++;
		}
		return sampled;
	}

}

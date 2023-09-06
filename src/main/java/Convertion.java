public class Convertion {
	public int convertFromBinary(String binary) {
		int positionMultiplier = 1;
		int decimal = 0;

		for(int i = binary.length()-1; i >=0; i--) {
			if (binary.charAt(i) == '1') {
				decimal += positionMultiplier;
			}
			positionMultiplier *= 2;
		}
		return decimal;
	}

	public int convertFromOctal(String octal) {
		int positionMultiplier = 1;
		int decimal = 0;

		for (int i = octal.length() - 1; i >= 0; i--) {
			decimal += (octal.charAt(i) - '0') * positionMultiplier;
			positionMultiplier *= 8;
		}
		return decimal;
	}

	// Book solution
	public int convertToDecimal(String oct) {
		int result = 0;
		for (int i = 1; i <= oct.length(); i++) {
			int octDigit = Integer.parseInt(oct.charAt(oct.length() - i) + "");
			result += Math.pow(8, i - 1) * octDigit;
		}
		return result;
	}
}

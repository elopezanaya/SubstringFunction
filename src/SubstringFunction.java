public class SubstringFunction {

	
	private boolean validText(String text){
		
		if (text!= null && text.trim().length()>0){
			
			return true;
		}
		
		
		return false;
	}
	
	//Big-O (n)
	public boolean findString(String original, String textTofind) {

		
		if (validText(original) && validText(textTofind)){
			
		
		int lenghtOfTextTofind = textTofind.length();

		int lenghtOfMasterString = original.length();

		System.out.println(original);
		System.out.println(textTofind);

		char[] masterStringCharArray = original.toCharArray();

		char[] mainStringCharArray = textTofind.toCharArray();

		System.out.println(mainStringCharArray[0]);

		
		int positionOfLetter = original.indexOf(mainStringCharArray[0]);

		if (positionOfLetter > -1) {

			if ((positionOfLetter + (lenghtOfTextTofind - 1)) <= lenghtOfMasterString) {

				if (masterStringCharArray[positionOfLetter + 1] == mainStringCharArray[1]) {

					int counter = 0;

					System.out.println(positionOfLetter);

					for (int i = positionOfLetter; i < mainStringCharArray.length; i++) {

						System.out.println(masterStringCharArray[i]);
						System.out.println(mainStringCharArray[counter]);

						if (String.valueOf(masterStringCharArray[i]).equals(
								String.valueOf(mainStringCharArray[counter]))) {
							counter++;
							System.out.println("dale");

						} else {

							System.out.println("not cool");
							System.out.println(masterStringCharArray[i]);
							System.out.println(mainStringCharArray[counter]);
							return false;
						}

					}

					System.out.println("ya estuvo");
					return true;

				} else {

					return this.findString(textTofind, original.substring(
							positionOfLetter + 1, lenghtOfMasterString));

				}

			} else {

				System.out.println("Substring not present in master String");

				return false;
			}

		} else {

			System.out.println(positionOfLetter);
		}
		System.out.println(positionOfLetter);
		System.out.println("esto que?");
		return false;

	}
		return false;

	}

}

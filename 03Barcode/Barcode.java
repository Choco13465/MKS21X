public class Barcode implements Comparable<Barcode>{
    private String _zip;
    private int _checkDigit;

    public Barcode(String zip){
	if (_zip.length() < 5 || _zip.length > 5) {
	    throw new RuntimeException("zip is not the correct length");
	}
	_zip = zip;
    }
    public Barcode clone(){}
    private int CheckSum(){
	int check = -1;
	int zel = 0;
	for (int i = 0; i < _zip.length; i++){
	    zel +=  _zip.substring(i);
	}
	check = zel % 10;
	return check;
    }
}

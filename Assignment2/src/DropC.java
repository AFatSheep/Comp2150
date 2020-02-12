class DropC {
	private int i = 0;

	DropC increment() {
		i++;
		return this;
	}

	void print() {
		System.out.println("number of DropC = " + i);
	}
}

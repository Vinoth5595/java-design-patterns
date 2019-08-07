package behavioral.iterator;

public class CollectionOfNames implements Container {
	public String name[] = { "Java", "Python", ".Net", "JavaScript", "NodeJS" };

	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new IterateCollectionOfNames();
	}

	private class IterateCollectionOfNames implements Iterator {
		int i;

		@Override
		public boolean hasNext() {
			if (i < name.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return name[i++];
			}
			return null;
		}
	}

}

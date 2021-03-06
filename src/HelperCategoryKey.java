import jade.core.AID;

public class HelperCategoryKey {
	private AID helper;
	private String category;
	
	public HelperCategoryKey(AID helper, String category) {
		this.helper = helper;
		this.category = category;
	}
		
	//generated by Eclipse
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((helper == null) ? 0 : helper.hashCode());
		return result;
	}
	
	//generated by Eclipse
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HelperCategoryKey other = (HelperCategoryKey) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (helper == null) {
			if (other.helper != null)
				return false;
		} else if (!helper.equals(other.helper))
			return false;
		return true;
	}
}

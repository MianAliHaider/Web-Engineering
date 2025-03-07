class ResearchAssistant extends Staff
{
	private double stipend;
	private double researchGrant;
	
	public ResearchAssistant(String name,int ID,String department, double stipend, double researchGrant)
	{
		super(name,ID,department);
		this.stipend=stipend;
		this.researchGrant=researchGrant;
	}
	
	@Override
	public double calSalary()
	{
		return stipend + researchGrant;
	}
	
	@Override
    public String toString() {
        return super.toString()+", Stipend: "+stipend+", Research Grant: "+researchGrant;
    }
}
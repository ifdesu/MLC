public class ITF_string extends N
{
  String value;
  
  public ITF_string(String value)
  {
    this.value = value;
  }
  
  @Override
  public void CALLITF_DRAW(int idx, float x, float y, float w, float h)
  {
    G.D2.text(value,x,y+h);
  }
}

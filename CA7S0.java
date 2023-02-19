public class CA7S0 extends N
{
  String value;
  
  public CA7S0(String value)
  {
    this.value = value;
  }
  
  @Override
  public void CALLITF_DRAW(int idx, float x, float y, float w, float h)
  {
    G.D2.text(value,x,y+h);
  }
}

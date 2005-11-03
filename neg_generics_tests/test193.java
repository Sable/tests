import java.util.Map;
import java.util.Set;
public class test193 {
  Set<Map.Entry<Integer, ?>> m_values;
  test193(Map<Integer, ?> values) {
    m_values = values.entrySet();
  }
}

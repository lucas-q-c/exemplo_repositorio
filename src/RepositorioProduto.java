import java.util.HashMap;
import java.util.Map;

public class RepositorioProduto {
	
	Map<String, Produto> produtos = new HashMap<>();
	
	public void addProd(String chave, Produto prod) {
		produtos.put(chave, prod);
	}
	
	public Produto getProd(String chave) {
		return produtos.get(chave);
	}
}

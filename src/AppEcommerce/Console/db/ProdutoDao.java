package AppEcommerce.Console.db;

import AppEcommerce.Console.core.Produto;

import java.sql.Connection;
import java.util.List;

public class ProdutoDao implements IDataAccessObject<Produto> {
    private Connection conn;

    public ProdutoDao() {
        this.conn = new ConnectionFactory().getConnection();
    }
    @Override
    public void save(Produto obj) {

    }

    @Override
    public void update(Produto obj) {

    }

    @Override
    public void delete(Object id) {

    }

    @Override
    public List<Produto> getAll() {
        return null;
    }
}

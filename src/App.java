import one_digitalinovation_gof.facade.Facade;
import one_digitalinovation_gof.singleton.SingletonEager;
import one_digitalinovation_gof.singleton.SingletonLazy;
import one_digitalinovation_gof.singleton.SingletonLazyHolder;
import one_digitalinovation_gof.strategy.Comportamento;
import one_digitalinovation_gof.strategy.ComportamentoAgressivo;
import one_digitalinovation_gof.strategy.ComportamentoDefensivo;
import one_digitalinovation_gof.strategy.ComportamentoNormal;
import one_digitalinovation_gof.strategy.Robo;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Singleton
        
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();

        //Facade

        Facade facade = new Facade();
        facade.migrarCliente("Matheus", "31520420");
    }
}

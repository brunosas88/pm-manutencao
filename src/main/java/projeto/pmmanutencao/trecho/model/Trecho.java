package projeto.pmmanutencao.trecho.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "trecho")
public class Trecho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "super", nullable = false)
    private String superColuna;

    @Column(name = "setor", nullable = false)
    private String setor;

    @Column(name = "utd", nullable = false)
    private String utd;

    @Column(name = "conjunto", nullable = false)
    private String conjunto;

    @Column(name = "alimentador", nullable = false)
    private String alimentador;

    @Column(name = "objeto_tecnico", nullable = false)
    private String objetoTecnico;

    @Column(name = "chave_direcionadora", nullable = false)
    private String chaveDirecionadora;

    @Column(name = "cd_trafo", nullable = false)
    private String cdTrafo;

    @Column(name = "trecho", nullable = false)
    private String trecho;

    @Column(name = "tipo", nullable = false)
    private String tipo;

    @Column(name = "km", nullable = false)
    private String km;

    @Column(name = "km_mt", nullable = false)
    private String kmMt;

    @Column(name = "km_bt", nullable = false)
    private String kmBt;

    @Column(name = "status_inspecao", nullable = false)
    private String statusInspecao;

    @Column(name = "data_inspecao", nullable = false)
    private Date dataInspecao;

    @Column(name = "qtde_defeitos_pendentes", nullable = false)
    private String qtdeDefeitosPendentes;

    @Column(name = "qtde_defeitos_executados", nullable = false)
    private String qtdeDefeitosExecutados;

    @Column(name = "status_execução", nullable = false)
    private String statusExecucao;

    @Column(name = "data_execucao", nullable = false)
    private Date dataExecucao;

    @Column(name = "ciclo", nullable = false)
    private String ciclo;

    @Column(name = "ano_plano_eqm", nullable = false)
    private String anoPlanoEqm;

    @Column(name = "ano_contabilizar", nullable = false)
    private String anoContabilizar;

}

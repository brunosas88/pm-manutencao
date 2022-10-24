package projeto.pmmanutencao.defeito.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "defeito")
public class Defeito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "super", nullable = false)
    private String superColuna;

    @Column (nullable = false)
    private String setor;

    @Column (nullable = false)
    private String utd;

    @Column (name = "desc_inst_ativo_insp", nullable = false)
    private String descInstAtivoInsp;

    @Column (name = "chave_direcionadora", nullable = false)
    private String chaveDirecionadora;

    @Column (name = "cd_trafo", nullable = false)
    private String cdTrafo;

    @Column (name = "trecho", nullable = false)
    private String trecho;

    @Column (name = "tipo_emr", nullable = false)
    private String tipoEmr;

    @Column (name = "cod_leitura_ponto", nullable = false)
    private String codLeituraPonto;

    @Column (name = "num_consequencia", nullable = false)
    private String numConsequencia;

    @Column (name = "desc_fam_ativo_insp", nullable = false)
    private String descFamAtivoInsp;

    @Column (name = "desc_local_ativo_insp", nullable = false)
    private String descLocalAtivoInsp;

    @Column (name = "defeito", nullable = false)
    private String defeito;

    @Column (name = "qntd_ajustada", nullable = false)
    private String qntdAjustada;

    @Column (name = "tipo_defeito", nullable = false)
    private String tipoDefeito;

    @Column (name = "mes_saida", nullable = false)
    private String mesSaida;

    @Column (name = "status_execucao", nullable = false)
    private String statusExecucao;

    @Column (name = "nivel", nullable = false)
    private String nivel;

    @Column (name = "segmento", nullable = false)
    private String segmento;

    @Column (name = "local_defeito", nullable = false)
    private String localDefeito;

    @Column (name = "status_indicador", nullable = false)
    private String statusIndicador;

    @Column (name = "equipe_os_insp", nullable = false)
    private String equipeOsInsp;

    @Column (name = "mat_inspetor", nullable = false)
    private String matInspetor;

    @Column (name = "mat_digitador", nullable = false)
    private String matDigitador;

    @Column (name = "num_os_insp", nullable = false)
    private String numOsInsp;

    @Column (name = "cod_esquema_insp", nullable = false)
    private String codEsquemaInsp;

    @Column (name = "dt_fim_exec_os_insp", nullable = false)
    private Date dtFimExecOsInsp;

    @Column (name = "dt_registro", nullable = false)
    private Date dtRegistro;

    @Column (name = "dt_inic_conseq", nullable = false)
    private Date dtInicConseq;

    @Column (name = "dt_fim_conseq", nullable = false)
    private Date dtFimConseq;

    @Column (name = "dt_fim_exec_conseq", nullable = false)
    private Date dtFimExecConseq;

    @Column (name = "desc_item_comentario", nullable = false)
    private String descItemComentario;

    @Column (name = "num_os_rs", nullable = false)
    private String numOsRs;

    @Column (name = "trafo", nullable = false)
    private String trafo;

    @Column (name = "latitude", nullable = false)
    private String latitude;

    @Column (name = "longitude", nullable = false)
    private String longitude;

    @Column (name = "justificativa_expurgo", nullable = false)
    private String justificativaExpurgo;

    @Column (name = "ano_referencia", nullable = false)
    private String anoReferencia;

}

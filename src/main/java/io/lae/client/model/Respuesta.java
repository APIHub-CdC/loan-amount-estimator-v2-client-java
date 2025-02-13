package io.lae.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Respuesta {
	@SerializedName("folioOtorgante")
	private String folioOtorgante = null;
	@SerializedName("folioConsultaLAE")
	private String folioConsultaLAE = null;
	@SerializedName("scores")
	private List<LaeScore> scores = null;
	@SerializedName("reasonCode")
	private String reasonCode = null;

	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public Respuesta folioOtorgante(String folioOtorgante) {
		this.folioOtorgante = folioOtorgante;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getFolioOtorgante() {
		return folioOtorgante;
	}

	public void setFolioOtorgante(String folioOtorgante) {
		this.folioOtorgante = folioOtorgante;
	}

	public Respuesta folioConsultaLAE(String folioConsultaLAE) {
		this.folioConsultaLAE = folioConsultaLAE;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getFolioConsultaLAE() {
		return folioConsultaLAE;
	}

	public void setFolioConsultaLAE(String folioConsultaLAE) {
		this.folioConsultaLAE = folioConsultaLAE;
	}

	public Respuesta scores(List<LaeScore> scores) {
		this.scores = scores;
		return this;
	}

	public Respuesta addScoresItem(LaeScore scoresItem) {
		if (this.scores == null) {
			this.scores = new ArrayList<LaeScore>();
		}
		this.scores.add(scoresItem);
		return this;
	}

	@ApiModelProperty(value = "")
	public List<LaeScore> getScores() {
		return scores;
	}

	public void setScores(List<LaeScore> scores) {
		this.scores = scores;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Respuesta respuesta = (Respuesta) o;
		return Objects.equals(this.folioOtorgante, respuesta.folioOtorgante)
				&& Objects.equals(this.folioConsultaLAE, respuesta.folioConsultaLAE)
				&& Objects.equals(this.scores, respuesta.scores);
	}

	@Override
	public int hashCode() {
		return Objects.hash(folioOtorgante, folioConsultaLAE, scores);
	}

	@Override
	public String toString() {
		return "Respuesta{" +
				"folioOtorgante='" + folioOtorgante + '\'' +
				", folioConsultaLAE='" + folioConsultaLAE + '\'' +
				", scores=" + scores +
				", reasonCode='" + reasonCode + '\'' +
				'}';
	}

	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}

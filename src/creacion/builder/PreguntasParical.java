package creacion.builder;

import java.math.BigDecimal;

public class PreguntasParical {

	private String paisMasGrande;
	private int cantDePaisesLatinoamerica;
	private boolean cordobaEsPais;
	private boolean dinamarcaEsLATAM;
	private boolean brasilEsLATAM;
	private boolean boliviaEsLATAM;
	private boolean rumaniaLATAM;

	public String getPaisMasGrande() {
		return paisMasGrande;
	}

	public void setPaisMasGrande(String paisMasGrande) {
		this.paisMasGrande = paisMasGrande;
	}

	public int getCantDePaisesLatinoamerica() {
		return cantDePaisesLatinoamerica;
	}

	public void setCantDePaisesLatinoamerica(int cantDePaisesLatinoamerica) {
		this.cantDePaisesLatinoamerica = cantDePaisesLatinoamerica;
	}

	public boolean isCordobaEsPais() {
		return cordobaEsPais;
	}

	public void setCordobaEsPais(boolean cordobaEsPais) {
		this.cordobaEsPais = cordobaEsPais;
	}

	public boolean isDinamarcaEsLATAM() {
		return dinamarcaEsLATAM;
	}

	public void setDinamarcaEsLATAM(boolean dinamarcaEsLATAM) {
		this.dinamarcaEsLATAM = dinamarcaEsLATAM;
	}

	public boolean isBrasilEsLATAM() {
		return brasilEsLATAM;
	}

	public void setBrasilEsLATAM(boolean brasilEsLATAM) {
		this.brasilEsLATAM = brasilEsLATAM;
	}

	public boolean isBoliviaEsLATAM() {
		return boliviaEsLATAM;
	}

	public void setBoliviaEsLATAM(boolean boliviaEsLATAM) {
		this.boliviaEsLATAM = boliviaEsLATAM;
	}

	public boolean isRumaniaLATAM() {
		return rumaniaLATAM;
	}

	public void setRumaniaLATAM(boolean rumaniaLATAM) {
		this.rumaniaLATAM = rumaniaLATAM;
	}

	public PreguntasParical() {

	}

	// Constructor comun
	public PreguntasParical(String paisMasGrande, int cantDePaisesLatinoamerica, boolean cordobaEsPais,
			boolean dinamarcaEsLATAM, boolean brasilEsLATAM, boolean boliviaEsLATAM, boolean rumaniaLATAM) {
		
		this.paisMasGrande = paisMasGrande;
		this.cantDePaisesLatinoamerica = cantDePaisesLatinoamerica;
		this.cordobaEsPais = cordobaEsPais;
		this.dinamarcaEsLATAM = dinamarcaEsLATAM;
		this.brasilEsLATAM = brasilEsLATAM;
		this.boliviaEsLATAM = boliviaEsLATAM;
		this.rumaniaLATAM = rumaniaLATAM;
	}

	// Usando Builder
	public PreguntasParical(Builder builder) {
		this.setPaisMasGrande(builder.paisMasGrande);
		this.setCantDePaisesLatinoamerica(builder.cantDePaisesLatinoamerica);
		this.setCordobaEsPais(builder.cordobaEsPais);
		this.setDinamarcaEsLATAM(builder.dinamarcaEsLATAM);
		this.setBrasilEsLATAM(builder.brasilEsLATAM);
		this.setBoliviaEsLATAM(builder.boliviaEsLATAM);
		this.setRumaniaLATAM(builder.rumaniaLATAM);
	}

	@Override
	public String toString() {
		return "PreguntasParical [paisMasGrande=" + paisMasGrande + ", cantDePaisesLatinoamerica="
				+ cantDePaisesLatinoamerica + ", cordobaEsPais=" + cordobaEsPais + ", dinamarcaEsLATAM="
				+ dinamarcaEsLATAM + ", brasilEsLATAM=" + brasilEsLATAM + ", boliviaEsLATAM=" + boliviaEsLATAM
				+ ", rumaniaLATAM=" + rumaniaLATAM + "]";
	}

	public static final class Builder {
		private String paisMasGrande;
		private int cantDePaisesLatinoamerica;
		private boolean cordobaEsPais;
		private boolean dinamarcaEsLATAM;
		private boolean brasilEsLATAM;
		private boolean boliviaEsLATAM;
		private boolean rumaniaLATAM;

		public Builder withpaIsMasGrande(String paisMasGrande) {
			this.paisMasGrande = paisMasGrande;
			return this;
		}

		public Builder withCantDePaisesLatinoamerica(int cantDePaisesLatinoamerica) {
			this.cantDePaisesLatinoamerica = cantDePaisesLatinoamerica;
			return this;
		}

		public Builder withCordobaEsPais(boolean cordobaEsPais) {
			this.cordobaEsPais = cordobaEsPais;
			return this;
		}

		public Builder withDinamarcaEsLATAM(boolean dinamarcaEsLATAM) {
			this.cordobaEsPais = dinamarcaEsLATAM;
			return this;
		}

		public Builder withBrasilEsLATAM(boolean brasilEsLATAM) {
			this.brasilEsLATAM = brasilEsLATAM;
			return this;
		}

		public Builder withBoliviaEsLATAM(boolean boliviaEsLATAM) {
			this.boliviaEsLATAM = boliviaEsLATAM;
			return this;
		}

		public Builder withRumaniaLATAM(boolean rumaniaLATAM) {
			this.rumaniaLATAM = rumaniaLATAM;
			return this;
		}

		public PreguntasParical build() {
			return new PreguntasParical(this);
		}
	}

	public static Builder newBuilder() {
		return new Builder();
	}

}

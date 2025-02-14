package guru.springframework.fizz_service.web.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public class FizzDto {
    private UUID id;
    private Integer version;
    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;
    private String fizzName;
    private FizzStyleEnum fizzStyle;
    private Long upc;
    private BigDecimal price;
    private Integer quantityOnHand;

    public FizzDto(UUID id, Integer version, OffsetDateTime createdDate, OffsetDateTime lastModifiedDate, String fizzName, FizzStyleEnum fizzStyle, Long upc, BigDecimal price, Integer quantityOnHand) {
        this.id = id;
        this.version = version;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.fizzName = fizzName;
        this.fizzStyle = fizzStyle;
        this.upc = upc;
        this.price = price;
        this.quantityOnHand = quantityOnHand;
    }

    public FizzDto() {
    }

    public static FizzDtoBuilder builder() {
        return new FizzDtoBuilder();
    }

    public UUID getId() {
        return this.id;
    }

    public Integer getVersion() {
        return this.version;
    }

    public OffsetDateTime getCreatedDate() {
        return this.createdDate;
    }

    public OffsetDateTime getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public String getFizzName() {
        return this.fizzName;
    }

    public FizzStyleEnum getFizzStyle() {
        return this.fizzStyle;
    }

    public Long getUpc() {
        return this.upc;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public Integer getQuantityOnHand() {
        return this.quantityOnHand;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public void setCreatedDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public void setFizzName(String fizzName) {
        this.fizzName = fizzName;
    }

    public void setFizzStyle(FizzStyleEnum fizzStyle) {
        this.fizzStyle = fizzStyle;
    }

    public void setUpc(Long upc) {
        this.upc = upc;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setQuantityOnHand(Integer quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof FizzDto)) return false;
        final FizzDto other = (FizzDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$version = this.getVersion();
        final Object other$version = other.getVersion();
        if (this$version == null ? other$version != null : !this$version.equals(other$version)) return false;
        final Object this$createdDate = this.getCreatedDate();
        final Object other$createdDate = other.getCreatedDate();
        if (this$createdDate == null ? other$createdDate != null : !this$createdDate.equals(other$createdDate))
            return false;
        final Object this$lastModifiedDate = this.getLastModifiedDate();
        final Object other$lastModifiedDate = other.getLastModifiedDate();
        if (this$lastModifiedDate == null ? other$lastModifiedDate != null : !this$lastModifiedDate.equals(other$lastModifiedDate))
            return false;
        final Object this$fizzName = this.getFizzName();
        final Object other$fizzName = other.getFizzName();
        if (this$fizzName == null ? other$fizzName != null : !this$fizzName.equals(other$fizzName)) return false;
        final Object this$fizzStyle = this.getFizzStyle();
        final Object other$fizzStyle = other.getFizzStyle();
        if (this$fizzStyle == null ? other$fizzStyle != null : !this$fizzStyle.equals(other$fizzStyle)) return false;
        final Object this$upc = this.getUpc();
        final Object other$upc = other.getUpc();
        if (this$upc == null ? other$upc != null : !this$upc.equals(other$upc)) return false;
        final Object this$price = this.getPrice();
        final Object other$price = other.getPrice();
        if (this$price == null ? other$price != null : !this$price.equals(other$price)) return false;
        final Object this$quantityOnHand = this.getQuantityOnHand();
        final Object other$quantityOnHand = other.getQuantityOnHand();
        if (this$quantityOnHand == null ? other$quantityOnHand != null : !this$quantityOnHand.equals(other$quantityOnHand))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof FizzDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $version = this.getVersion();
        result = result * PRIME + ($version == null ? 43 : $version.hashCode());
        final Object $createdDate = this.getCreatedDate();
        result = result * PRIME + ($createdDate == null ? 43 : $createdDate.hashCode());
        final Object $lastModifiedDate = this.getLastModifiedDate();
        result = result * PRIME + ($lastModifiedDate == null ? 43 : $lastModifiedDate.hashCode());
        final Object $fizzName = this.getFizzName();
        result = result * PRIME + ($fizzName == null ? 43 : $fizzName.hashCode());
        final Object $fizzStyle = this.getFizzStyle();
        result = result * PRIME + ($fizzStyle == null ? 43 : $fizzStyle.hashCode());
        final Object $upc = this.getUpc();
        result = result * PRIME + ($upc == null ? 43 : $upc.hashCode());
        final Object $price = this.getPrice();
        result = result * PRIME + ($price == null ? 43 : $price.hashCode());
        final Object $quantityOnHand = this.getQuantityOnHand();
        result = result * PRIME + ($quantityOnHand == null ? 43 : $quantityOnHand.hashCode());
        return result;
    }

    public String toString() {
        return "FizzDto(id=" + this.getId() + ", version=" + this.getVersion() + ", createdDate=" + this.getCreatedDate() + ", lastModifiedDate=" + this.getLastModifiedDate() + ", fizzName=" + this.getFizzName() + ", fizzStyle=" + this.getFizzStyle() + ", upc=" + this.getUpc() + ", price=" + this.getPrice() + ", quantityOnHand=" + this.getQuantityOnHand() + ")";
    }

    public static class FizzDtoBuilder {
        private UUID id;
        private Integer version;
        private OffsetDateTime createdDate;
        private OffsetDateTime lastModifiedDate;
        private String fizzName;
        private FizzStyleEnum fizzStyle;
        private Long upc;
        private BigDecimal price;
        private Integer quantityOnHand;

        FizzDtoBuilder() {
        }

        public FizzDtoBuilder id(UUID id) {
            this.id = id;
            return this;
        }

        public FizzDtoBuilder version(Integer version) {
            this.version = version;
            return this;
        }

        public FizzDtoBuilder createdDate(OffsetDateTime createdDate) {
            this.createdDate = createdDate;
            return this;
        }

        public FizzDtoBuilder lastModifiedDate(OffsetDateTime lastModifiedDate) {
            this.lastModifiedDate = lastModifiedDate;
            return this;
        }

        public FizzDtoBuilder fizzName(String fizzName) {
            this.fizzName = fizzName;
            return this;
        }

        public FizzDtoBuilder fizzStyle(FizzStyleEnum fizzStyle) {
            this.fizzStyle = fizzStyle;
            return this;
        }

        public FizzDtoBuilder upc(Long upc) {
            this.upc = upc;
            return this;
        }

        public FizzDtoBuilder price(BigDecimal price) {
            this.price = price;
            return this;
        }

        public FizzDtoBuilder quantityOnHand(Integer quantityOnHand) {
            this.quantityOnHand = quantityOnHand;
            return this;
        }

        public FizzDto build() {
            return new FizzDto(this.id, this.version, this.createdDate, this.lastModifiedDate, this.fizzName, this.fizzStyle, this.upc, this.price, this.quantityOnHand);
        }

        public String toString() {
            return "FizzDto.FizzDtoBuilder(id=" + this.id + ", version=" + this.version + ", createdDate=" + this.createdDate + ", lastModifiedDate=" + this.lastModifiedDate + ", fizzName=" + this.fizzName + ", fizzStyle=" + this.fizzStyle + ", upc=" + this.upc + ", price=" + this.price + ", quantityOnHand=" + this.quantityOnHand + ")";
        }
    }
}

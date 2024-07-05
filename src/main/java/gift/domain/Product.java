package gift.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Product {
    private Long id;

    @NotBlank(message = "상품 이름은 반드시 입력해야 합니다.")
    @Size(max = 15, message = "상품 이름은 공백을 포함하여 최대 15자까지 입력할 수 있습니다.")
    @Pattern(regexp = "^[ㄱ-ㅎ가-힣a-zA-Z0-9\\s\\(\\)\\[\\]+\\-&/_]*$", message = "특수문자는 '(), [], +, -, &, /, _'만 사용할 수 있습니다.")
    @Pattern(regexp = "^(?!.*카카오).*$", message = "'카카오'가 포함된 문구는 담당 MD와 협의해주세요.")
    private String name;
    private Long price;
    private String imageUrl;

    public Product() {}

    public Product(Long id, String name, Long price, String imageUrl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getPrice() {
        return price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

}
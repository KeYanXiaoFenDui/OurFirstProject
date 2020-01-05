package pattren.strategy.pay.payport;

/**
 * 姑且把这个枚举当常量来维护
 */
public enum PayType {
    ALI_PAY(new AliPay()),
    WECHAT_PAY(new WechatPay()),
    UNION_PAY(new UnionPay()),
    JD_PAY(new JDPay());

    private Payment payment;
    PayType(Payment payment){
        this.payment = payment;
    }
    public Payment get(){
        return this.payment;
    }
}

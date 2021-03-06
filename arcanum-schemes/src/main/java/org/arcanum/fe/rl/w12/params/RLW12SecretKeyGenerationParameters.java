package org.arcanum.fe.rl.w12.params;

import org.arcanum.program.dfa.DFA;
import org.bouncycastle.crypto.KeyGenerationParameters;

/**
 * @author Angelo De Caro (arcanumlib@gmail.com)
 */
public class RLW12SecretKeyGenerationParameters extends KeyGenerationParameters {

    private RLW12PublicKeyParameters publicKeyParameters;
    private RLW12MasterSecretKeyParameters masterSecretKeyParameters;
    private DFA dfa;


    public RLW12SecretKeyGenerationParameters(
            RLW12PublicKeyParameters publicKeyParameters,
            RLW12MasterSecretKeyParameters masterSecretKeyParameters,
            DFA dfa) {
        super(null, masterSecretKeyParameters.getParameters().getG().getField().getLengthInBytes());

        this.publicKeyParameters = publicKeyParameters;
        this.masterSecretKeyParameters = masterSecretKeyParameters;
        this.dfa = dfa;
    }


    public RLW12PublicKeyParameters getPublicKeyParameters() {
        return publicKeyParameters;
    }

    public RLW12MasterSecretKeyParameters getMasterSecretKeyParameters() {
        return masterSecretKeyParameters;
    }

    public DFA getDfa() {
        return dfa;
    }
}
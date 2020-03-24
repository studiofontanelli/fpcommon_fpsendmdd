package test.fpsend;

import it.csi.csi.wrapper.SystemException;
import it.csi.csi.wrapper.UnrecoverableException;

import it.csi.fpcore.fpsend.dto.fpsend.*;

import it.csi.fpcommon.fpsend.interfacecsi.fpsend.*;

import it.csi.fpcore.fpsend.exception.fpsend.*;

import it.csi.csi.util.xml.*;
import it.csi.csi.porte.*;
import it.csi.csi.porte.proxy.*;
import javax.sql.DataSource;
import org.apache.log4j.*;
import junit.framework.TestCase;

/*PROTECTED REGION ID(R1671990517) ENABLED START*/
/// inserire qui eventuali import aggiuntive
/*PROTECTED REGION END*/

/**
 * @generated
 */
public class TestFpsend extends TestCase {

	/**
	 * @generated
	 */
	public static final String LOGGER_PREFIX = "fpsend";

	/**
	 * @generated
	 */
	it.csi.fpcommon.fpsend.interfacecsi.fpsend.FpsendSrv pd = null;

	/**
	 * @generated
	 */
	public void setUp() throws Exception {
		InfoPortaDelegata info = PDConfigReader
				.read("test/java/test/fpsend/defpd_fpsend.xml");
		pd = (it.csi.fpcommon.fpsend.interfacecsi.fpsend.FpsendSrv) PDProxy
				.newInstance(info);
	}

	/*PROTECTED REGION ID(R-1112972457) ENABLED START*/
	// inserire qui la definizione di variabili locali, costanti da usare nel test.
	// non verranno sovrascritte da successive rigenerazioni
	/*PROTECTED REGION END*/

	/// Implementazione operazioni esposte dal servizio

	/**
	 * @generated
	 */
	public void testOperationSendMessage() {
		/*PROTECTED REGION ID(R1118363327) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationSendMessages() {
		/*PROTECTED REGION ID(R309524884) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationSendPec() {
		/*PROTECTED REGION ID(R-114578490) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationVerificaEsitoInvioPec() {
		/*PROTECTED REGION ID(R1395230758) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testOperationRecuperaPec() {
		/*PROTECTED REGION ID(R1881863525) ENABLED START*/
		/// inserire qui la logica di test per l'operazione.
		/// il codice sara' preservato per successive rigenerazioni
		/*PROTECTED REGION END*/
	}

	/**
	 * @generated
	 */
	public void testTestResources() {
		try {
			pd.testResources();
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	/**
	 * @generated
	 */
	public void testSelfCheck() {
		try {
			pd.selfCheck(null);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	/**
	 * @generated
	 */
	protected Logger getLogger(String subsystem) {
		if (subsystem != null)
			return Logger.getLogger(LOGGER_PREFIX + "." + subsystem);
		else
			return Logger.getLogger(LOGGER_PREFIX);
	}

	/// eventuali metodi aggiuntivi
	/*PROTECTED REGION ID(R1276326360) ENABLED START*/
	// inserire qui la dichiarazione di eventuali metodi aggiuntivi utili
	// per l'implementazione.
	// non verra' sovrascritto da successive rigenerazioni.
	/*PROTECTED REGION END*/
}

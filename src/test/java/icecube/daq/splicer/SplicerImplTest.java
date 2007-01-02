/*
 * class: SplicerImplTest
 *
 * Version $Id: SplicerImplTest.java,v 1.4 2005/10/11 17:17:03 patton Exp $
 *
 * Date: August 1 2005
 *
 * (c) 2005 IceCube Collaboration
 */

package icecube.daq.splicer;

import icecube.daq.splicer.test.AbstractSplicerTest;
import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * This class defines the tests that any SplicerImpl object should pass.
 *
 * @author patton
 * @version $Id: SplicerImplTest.java,v 1.4 2005/10/11 17:17:03 patton Exp $
 */
public class SplicerImplTest
        extends AbstractSplicerTest
{

    // public static final member data

    // protected static final member data

    // static final member data

    // private static final member data

    // private static member data

    // private instance member data

    // constructors

    /**
     * Constructs and instance of this test.
     *
     * @param name the name of the test.
     */
    public SplicerImplTest(String name)
    {
        super(name);
    }

    // instance member method (alphabetic)

    protected Splicer createNewSplicer(SplicedAnalysis analysis)
    {
        return new SplicerImpl(analysis);
    }

    protected long getBeginDelay()
    {
        return 1;
    }

    protected long getClosureDelay()
    {
        return 1;
    }

    protected long getWeaveDelay()
    {
        return 1;
    }

    /**
     * Sets up the fixture, for example, open a network connection. This method
     * is called before a test is executed.
     *
     * @throws Exception if super class setUp fails.
     */
//    protected void setUp()
//            throws Exception
//    {
//        super.setUp();
//    }

    /**
     * Tears down the fixture, for example, close a network connection. This
     * method is called after a test is executed.
     *
     * @throws Exception if super class tearDown fails.
     */
    protected void tearDown()
            throws Exception
    {
        super.tearDown();
    }

    public void testCleanRestartAndStop()
            throws OrderingException, ClosedStrandException
    {
        // currently no implemented correctly.
    }

    // static member methods (alphabetic)

    /**
     * Create test suite for this class.
     *
     * @return the suite of tests declared in this class.
     */
    public static Test suite()
    {
        return new TestSuite(SplicerImplTest.class);
    }

    // Description of this object.
    // public String toString() {}

    /**
     * Main routine which runs text test in standalone mode.
     *
     * @param args the arguments with which to execute this method.
     */
    public static void main(String[] args)
    {
        TestRunner.run(suite());
    }
}
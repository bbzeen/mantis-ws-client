package org.mantisbt.client;
/**
 * MantisBT WS Client - Stub for MantisBT WebService.
 * MantisBT WS Client is free software: you can redistribute
 * it and/or modify it under the terms of the GNU General Public
 * License as published by the Free Software Foundation, either
 * version 2 of the License, or (at your option) any later
 * version.
 * 
 * MantisBT SOAP Client is distributed in the hope that it will
 * be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 * PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with MantisBT.  If not, see <http://www.gnu.org/licenses/>.
 */

import java.math.BigInteger;

/**
 * @author Jeremie Lagarde
 * @since 1.2.5
 */
public interface IMantisWsService<FILTER, ISSUE> {

  void connect(String login, String password);

  FILTER[] getFilters(BigInteger projectId);

  ISSUE[] getIssues(FILTER filter);
}
